/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsNewFileContentProvider {
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsMetaInformation getMetaInformation() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.owl2fs.Owl2fsPackage.eINSTANCE.getOntologyDocument(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsResource());
	}
	
}