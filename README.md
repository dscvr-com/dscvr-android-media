# Orbit360 Media

Multimedia framework for GPU accellerated multimedia applications on android. 

This framework can be used to easily attach multiple data sinks to the phone's camera. It encapsulates the complicated workflow of the Android `camera2` API and handles application state changes gracefully. 

A sink to fetch RGB camera image data in high speed is also included. 

## Usage

This library can be used by subclassing `RecorderPreviewViewBase`. The library is tailored for the needs of DSCVR 360 and DSCVR facetracker, exact usage examples can be found there. 
