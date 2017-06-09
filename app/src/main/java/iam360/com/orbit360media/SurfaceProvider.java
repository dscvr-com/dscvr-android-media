package iam360.com.orbit360media;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;

/**
 * Created by Emi on 15/05/2017.
 */

public interface SurfaceProvider {
    Size[] getOutputSizes(StreamConfigurationMap map);
    Surface getSurface();

    void createSurface(Size size, SurfaceProviderCallback callback);
    void destroySurface(SurfaceProviderCallback callback);

    interface SurfaceProviderCallback {
        void SurfaceReady(SurfaceProvider sender, Surface surface, Size size);
        void SurfaceDestroyed(SurfaceProvider sender);
        void Error(String what);
    }
}
