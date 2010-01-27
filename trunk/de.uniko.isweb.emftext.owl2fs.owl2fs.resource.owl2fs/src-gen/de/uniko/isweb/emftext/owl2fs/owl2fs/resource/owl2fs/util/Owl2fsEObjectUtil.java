/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.util;

// A utility class that can be used to work with EObjects.
// While many similar methods are provided by EMF's own
// EcoreUtil class, the missing ones are collected here.
//
// @see org.eclipse.emf.ecore.util.EcoreUtil
public class Owl2fsEObjectUtil {
	
	public static <T> java.util.Collection<T> getObjectsByType(java.util.Iterator<?> iterator,
	org.eclipse.emf.ecore.EClassifier type) {
		java.util.Collection<T> result = new java.util.ArrayList<T>();
		while (iterator.hasNext()) {
			java.lang.Object object = iterator.next();
			if (type.isInstance(object)) {
				@SuppressWarnings("unchecked")				T t = (T) object;
				result.add(t);
			}
		}
		return result;
	}
	
	public static org.eclipse.emf.ecore.EObject findRootContainer(org.eclipse.emf.ecore.EObject object) {
		org.eclipse.emf.ecore.EObject container = object.eContainer();
		if (container != null) {
			return findRootContainer(container);
		} else {
			return object;
		}
	}
	
	public static java.lang.Object invokeOperation(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EOperation o) {
		java.lang.reflect.Method method;
		try {
			method = element.getClass().getMethod(o.getName(), new Class[]{});
			if (method != null) {
				java.lang.Object result = method.invoke(element, new java.lang.Object[]{});
				return result;
			}
		} catch (SecurityException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (NoSuchMethodException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (IllegalArgumentException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (IllegalAccessException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (java.lang.reflect.InvocationTargetException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		}
		return null;
	}
}