package com.swetha.admin.mausam.sync;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.app.Service;

/**
 * Created by ADMIN on 4/24/2016.
 */

public class MausamSyncService extends Service {
    private static final Object sSyncAdapterLock = new Object();
    private static MausamSyncAdapter mausamSyncAdapter = null;

    @Override
    public void onCreate() {
        Log.d("SunshineSyncService", "onCreate - SunshineSyncService");
        synchronized (sSyncAdapterLock) {
            if (mausamSyncAdapter == null) {
                mausamSyncAdapter = new MausamSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mausamSyncAdapter.getSyncAdapterBinder();
    }
}
