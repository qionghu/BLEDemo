package com.hq.blemeshdemo.Utils

class UUID {
    companion object {

        val DEVICE_INFO_UUID = "0000180a-0000-1000-8000-00805f9b34fb"
        val PROVISION_SERVICE_UUID = "00001827-0000-1000-8000-00805f9b34fb"

        val CONFIG_DESCRIPTOR_UUID = "00002902-0000-1000-8000-00805f9b34fb"
        val PROVISION_IN_CHARACTERISTRIC_UUID = "00002adb-0000-1000-8000-00805f9b34fb"
        val PROVISION_OUT_CHARACTERISTIC_UUID = "00002adc-0000-1000-8000-00805f9b34fb"


    }
}

class PDUType{
    companion object {
        val NETWORK_PDU = 0X00
        val MESH_BEACON_PDU = 0X01
        val PROXY_CONFIG_PDU = 0X02
        val PROVISIONING_PDU = 0X03
    }
}