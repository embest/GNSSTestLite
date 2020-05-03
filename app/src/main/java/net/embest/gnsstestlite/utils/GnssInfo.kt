package net.embest.gnsstestlite.utils

import java.util.ArrayList

class GnssInfo {
    var time: Long = 0
    var latitude = 0.0
    var longitude = 0.0
    var altitude = 0.0
    var speed = 0.0f
    var accuracy = 0.0f
    var nmea = ""
    var inview = 0
    var inuse = 0
    var ttff = 0f
    var ttff_nmea = 0f
    var acc_nmea = 0f
    var top4 = 0f



    val satellites: ArrayList<GnssSatellite> = ArrayList()

    init {
        reset()
    }

    fun reset() {
        time = 0
        latitude = 0.0
        longitude = 0.0
        altitude = 0.0
        speed = 0f
        accuracy = 0f
        inview = 0
        inuse = 0
        ttff = 0f
        ttff_nmea = 0f
        acc_nmea = 0f
        nmea = ""
        top4 = 0f
        satellites.clear()
    }

    fun addSatellite(satellite: GnssSatellite) {
        this.satellites.add(satellite)
        this.satellites.sortByDescending { it.cn0 }
    }

    fun cleanSatellites() {
        this.satellites.clear()
    }
}
