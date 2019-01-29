package com.example.vmann.mapbox.main;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.vmann.mapbox.R;


public class UploadingDialog extends ProgressDialog {
    public UploadingDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uploading_dialogfragment);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

}