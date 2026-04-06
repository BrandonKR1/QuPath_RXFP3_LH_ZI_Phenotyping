// DAPI cell detection. 
// Press the three dots on the bottom right of the window and click 'Run for project' to batch apply to all annotations/images of interest.
selectAnnotations();
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage":"DAPI","requestedPixelSizeMicrons":0.5,"backgroundRadiusMicrons":8.0,"backgroundByReconstruction":true,"medianRadiusMicrons":0,"sigmaMicrons":1.5,"minAreaMicrons":25.0,"maxAreaMicrons":500.0,"threshold":3500.0,"watershedPostProcess":true,"cellExpansionMicrons":5.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true}')
