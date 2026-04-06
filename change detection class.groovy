// Change detection classes.
// Use this script if you wish to manually override the automatic classification detection (i.e. when the classifiers have made obvious errors in the detection of some classes).
// Highlight the cells of interest and run this script to change their class.

def newPathClass = getPathClass("Cy3") // Here, change the class to the desired classification.
getSelectedObjects().forEach {
    it.setPathClass(newPathClass)
}
print "Done!"