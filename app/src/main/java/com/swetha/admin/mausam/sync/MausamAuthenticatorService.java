package com.swetha.admin.mausam.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by ADMIN on 4/24/2016.
 */

public class MausamAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private MausamAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new MausamAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
