package com.udacity.project4.utils

import android.os.Build
import androidx.annotation.RequiresApi

object Constants {
    //map settings
    const val  ZOOM_LEVEL = 15f

    //checking if the api is 29 or higher
    val RUNNING_Q_OR_LATER = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

    //checking if the api is 31 or higher
    //to handle the pending intent flag
    val RUNNING_S_OR_LATER = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S


    //foreground permission location
    const val FOREGROUND_LOCATION_REQUEST = 1
    const val FINE_LOCATION_PERMISSION = android.Manifest.permission.ACCESS_FINE_LOCATION
    const val COARSE_LOCATION_PERMISSION = android.Manifest.permission.ACCESS_COARSE_LOCATION

    //background permission
    const val REQUEST_CHECK_SETTINGS = 1111
    const val BACKGROUND_LOCATION_REQUEST = 2
    const val BACKGROUND_LOCATION_PERMISSION = android.Manifest.permission.ACCESS_BACKGROUND_LOCATION

    //location tracking constants
    const val MIN_TIME_UPDATE = 60 * 1000L
    const val MIN_DISTANCE_UPDATE = 0f


    //geofence constants
    const val GEOFENCE_RADIUS = 500f // in meters

}