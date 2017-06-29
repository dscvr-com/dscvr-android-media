package iam360.com.record;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraDevice;

import java.nio.ByteBuffer;

public interface RecorderPreviewListener {
    void imageDataReady(ByteBuffer data, int width, int height, Bitmap.Config colorFormat);

    void cameraOpened(CameraDevice device);

    void cameraClosed(CameraDevice device);
}