/*
 * Expanded the sub-set of Service and Attribute lists included
 * Modified: Andrew J Roberts, 2015-04-15
 *
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gamsystech.user.btnewtest.bluetoothlegatt;

import java.util.HashMap;
import java.util.UUID;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 * See: https://webbluetoothcg.github.io/web-bluetooth/#widl-BluetoothUuidsCharacteristic-cycling_power_feature
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap<String, String>();
    // GATT - Service Types
    // see: https://developer.bluetooth.org/gatt/services/Pages/ServicesHome.aspx?_ga=1.6792625.220697255.1428282736
    public static final String ALERT_NOTIFICATION           = "00001811-0000-1000-8000-00805f9b34fb";
    public static final String BATTERY_SERVICE              = "0000180f-0000-1000-8000-00805f9b34fb";
    public static final String BLOOD_PRESSURE_SERVICE       = "00001810-0000-1000-8000-00805f9b34fb";
    public static final String BODY_COMPOSITION_SERVICE     = "0000181B-0000-1000-8000-00805f9b34fb";
    public static final String BOND_MANAGEMENT_SERVICE      = "0000181E-0000-1000-8000-00805f9b34fb";
    public static final String CONTINUOUS_GLUCOSE_MONITORING_SERVICE = "0000181F-0000-1000-8000-00805f9b34fb";
    public static final String CURRENT_TIME_SERVICE         = "00001805-0000-1000-8000-00805f9b34fb";
    public static final String CYCLING_POWER_SERVICE        = "00001818-0000-1000-8000-00805f9b34fb";
    public static final String CYCLING_SPEED_AND_CADENCE    = "00001816-0000-1000-8000-00805f9b34fb";
    public static final String DEVICE_INFORMATION_SERVICE   = "0000180a-0000-1000-8000-00805f9b34fb";
    public static final String ENVIRONMENTAL_SENSING_SERVICE = "0000181a-0000-1000-8000-00805f9b34fb";
    public static final String GENERIC_ACCESS_SERVICE       = "00001800-0000-1000-8000-00805f9b34fb";
    public static final String GENERIC_ATTRIBUTE            = "00001801-0000-1000-8000-00805f9b34fb";
    public static final String GLUCOSE_SERVICE              = "00001808-0000-1000-8000-00805f9b34fb";
    public static final String HEALTH_THERMOMETER_SERVICE   = "00001809-0000-1000-8000-00805f9b34fb";
    public static final String HEART_RATE_SERVICE           = "0000180d-0000-1000-8000-00805f9b34fb";
    public static final String HUMAN_INTERFACE_DEVICE       = "00001812-0000-1000-8000-00805f9b34fb";
    public static final String IMMEDIATE_ALERT              = "00001802-0000-1000-8000-00805f9b34fb";
    public static final String INTERNET_PROTOCOL_SUPPORT_SERVICE = "00001820-0000-1000-8000-00805f9b34fb";
    public static final String LINK_LOSS                    = "00001803-0000-1000-8000-00805f9b34fb";
    public static final String LOCATION_SERVICE             = "00001819-0000-1000-8000-00805f9b34fb";
    public static final String NEXT_DST_CHANGE              = "00001807-0000-1000-8000-00805f9b34fb";
    public static final String PHONE_ALERT_STATUS           = "0000180e-0000-1000-8000-00805f9b34fb";
    public static final String REFERENCE_TIME_UPDATE        = "00001806-0000-1000-8000-00805f9b34fb";
    public static final String RUNNING_SPEED_AND_CADENCE    = "00001814-0000-1000-8000-00805f9b34fb";
    public static final String SCAN_PARAMETERS              = "00001813-0000-1000-8000-00805f9b34fb";
    public static final String TX_POWER                     = "00001804-0000-1000-8000-00805f9b34fb";
    public static final String USER_DATA                    = "0000181C-0000-1000-8000-00805f9b34fb";
    public static final String WEIGHT_SCALE_SERVICE         = "0000181D-0000-1000-8000-00805f9b34fb";
    // Other
    public static final String FIND_CENTRAL                 = "0daa5375-02d3-4b47-b6b7-53408ff159e5";
    public static final String SIMPLE_KEYS_SERV_UUID        = "0000ffe0-0000-1000-8000-00805f9b34fb";
    //Used by App
    public final static String BATTERY_LEVEL                = "00002a19-0000-1000-8000-00805f9b34fb";
    public final static String HEART_RATE_MEASUREMENT       = "00002a37-0000-1000-8000-00805f9b34fb";
    public final static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public final static UUID[] SUPPORTED_UUID = { UUID.fromString(HEART_RATE_SERVICE) };
    static {
        // Sample Services.
        attributes.put(ALERT_NOTIFICATION,          "Alert Notification Service" );
        attributes.put(BATTERY_SERVICE,             "Battery Information Service");
        attributes.put(BLOOD_PRESSURE_SERVICE,      "Blood Pressure Service");
        attributes.put(BODY_COMPOSITION_SERVICE,    "Body Composition Service");
        attributes.put(BOND_MANAGEMENT_SERVICE,     "Bond Management Service");
        attributes.put(CONTINUOUS_GLUCOSE_MONITORING_SERVICE, "Continuous Glucose Monitoring");
        attributes.put(CURRENT_TIME_SERVICE,        "Current Time Service");
        attributes.put(CYCLING_POWER_SERVICE,       "Cycling Power");
        attributes.put(CYCLING_SPEED_AND_CADENCE,   "Cycling Speed and Cadence Service");
        attributes.put(DEVICE_INFORMATION_SERVICE,  "Device Information Service");
        attributes.put(ENVIRONMENTAL_SENSING_SERVICE, "Environmental Sensing Service" );
        attributes.put(GENERIC_ACCESS_SERVICE,      "Generic Access Service");
        attributes.put(GENERIC_ATTRIBUTE,           "Generic Attribute" );
        attributes.put(GLUCOSE_SERVICE,             "Blood Glucose Service");
        attributes.put(HEALTH_THERMOMETER_SERVICE,  "Health Thermometer Service");
        attributes.put(HEART_RATE_SERVICE,          "Heart Rate Service");
        attributes.put(HUMAN_INTERFACE_DEVICE,      "Human Interface Device" );
        attributes.put(IMMEDIATE_ALERT,             "Immediate Alert" );
        attributes.put(INTERNET_PROTOCOL_SUPPORT_SERVICE, "Internet Protocol Support Service" );
        attributes.put(LINK_LOSS,                   "Link Loss" );
        attributes.put(LOCATION_SERVICE,            "Location and Navigation Service" );
        attributes.put(NEXT_DST_CHANGE,             "NEXT_DST_CHANGE" );
        attributes.put(PHONE_ALERT_STATUS,          "PHONE_ALERT_STATUS" );
        attributes.put(REFERENCE_TIME_UPDATE,       "Reference Time Update Service" );
        attributes.put(RUNNING_SPEED_AND_CADENCE,   "Running Speed and Cadence Service");
        attributes.put(SCAN_PARAMETERS,             "Scan Parameters" );
        attributes.put(TX_POWER,                    "TX_POWER" );
        attributes.put(USER_DATA,                   "User Data" );
        attributes.put(WEIGHT_SCALE_SERVICE,        "Weight Scale" );
        // Other
        attributes.put(FIND_CENTRAL,                "FIND_CENTRAL" );
        attributes.put(SIMPLE_KEYS_SERV_UUID,       "SIMPLE_KEYS_SERV_UUID" );
        // Sample Characteristics.
        // see: https://developer.bluetooth.org/gatt/characteristics/Pages/CharacteristicsHome.aspx
        attributes.put("00002a7e-0000-1000-8000-00805f9b34fb", "Aerobic Heart Rate Lower Limit");
        attributes.put("00002a84-0000-1000-8000-00805f9b34fb", "Aerobic Heart Rate Upper Limit");
        attributes.put("00002a7f-0000-1000-8000-00805f9b34fb", "Aerobic Threshold");
        attributes.put("00002a80-0000-1000-8000-00805f9b34fb", "Age");
        attributes.put("00002a43-0000-1000-8000-00805f9b34fb", "Alert Category ID");
        attributes.put("00002a42-0000-1000-8000-00805f9b34fb", "Alert Category ID Bit Mask");
        attributes.put("00002a06-0000-1000-8000-00805f9b34fb", "Alert Level");
        attributes.put("00002a44-0000-1000-8000-00805f9b34fb", "Alert Notification Control Point");
        attributes.put("00002a3f-0000-1000-8000-00805f9b34fb", "Alert Status");
        attributes.put("00002a81-0000-1000-8000-00805f9b34fb", "Anaerobic Heart Rate Lower Limit");
        attributes.put("00002a82-0000-1000-8000-00805f9b34fb", "Anaerobic Heart Rate Upper Limit");
        attributes.put("00002a83-0000-1000-8000-00805f9b34fb", "Anaerobic Threshold");
        attributes.put("00002a73-0000-1000-8000-00805f9b34fb", "Apparent Wind Direction");
        attributes.put("00002a72-0000-1000-8000-00805f9b34fb", "Apparent Wind Speed");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002aa3-0000-1000-8000-00805f9b34fb", "Barometric Pressure Trend");
        attributes.put(BATTERY_LEVEL,                          "Battery Level");
        attributes.put("00002a1b-0000-1000-8000-00805f9b34fb", "Battery Level State");
        attributes.put("00002a49-0000-1000-8000-00805f9b34fb", "Blood Pressure Feature");
        attributes.put("00002a35-0000-1000-8000-00805f9b34fb", "Blood Pressure Measurement");
        attributes.put("00002a9b-0000-1000-8000-00805f9b34fb", "Body Composition Feature");
        attributes.put("00002a9c-0000-1000-8000-00805f9b34fb", "Body Composition Measurement");
        attributes.put("00002a38-0000-1000-8000-00805f9b34fb", "Body Sensor Location");
        attributes.put("00002a22-0000-1000-8000-00805f9b34fb", "Boot Keyboard Input Report");
        attributes.put("00002a32-0000-1000-8000-00805f9b34fb", "Boot Keyboard Output Report");
        attributes.put("00002a33-0000-1000-8000-00805f9b34fb", "Boot Mouse Input Report");
        attributes.put("00002aa4-0000-1000-8000-00805f9b34fb", "Bond Management Control Point");
        attributes.put("00002aa5-0000-1000-8000-00805f9b34fb", "Bond Management Features");
        attributes.put("00002aa8-0000-1000-8000-00805f9b34fb", "CGM Feature");
        attributes.put("00002aa7-0000-1000-8000-00805f9b34fb", "CGM Measurement");
        attributes.put("00002aab-0000-1000-8000-00805f9b34fb", "CGM Session Run Time");
        attributes.put("00002aaa-0000-1000-8000-00805f9b34fb", "CGM Session Start Time");
        attributes.put("00002aac-0000-1000-8000-00805f9b34fb", "CGM Specific Ops Control Point");
        attributes.put("00002aa9-0000-1000-8000-00805f9b34fb", "CGM Status");
        attributes.put("00002904-0000-1000-8000-00805f9b34fb", "Characteristic Presentation Format");
        attributes.put(CLIENT_CHARACTERISTIC_CONFIG,           "Client Characteristic Configuration");
        attributes.put("00002a5c-0000-1000-8000-00805f9b34fb", "CSC Feature");
        attributes.put("00002a5b-0000-1000-8000-00805f9b34fb", "CSC Measurement");
        attributes.put("00002a2b-0000-1000-8000-00805f9b34fb", "Current Time");
        attributes.put("00002a66-0000-1000-8000-00805f9b34fb", "Cycling Power Control Point");
        attributes.put("00002a65-0000-1000-8000-00805f9b34fb", "Cycling Power feature");
        attributes.put("00002a63-0000-1000-8000-00805f9b34fb", "Cycling Power measurement");
        attributes.put("00002a64-0000-1000-8000-00805f9b34fb", "Cycling Power Vector");
        attributes.put("00002a99-0000-1000-8000-00805f9b34fb", "Database Change Increment");
        attributes.put("00002a86-0000-1000-8000-00805f9b34fb", "Date of Threshold Assessment");
        attributes.put("00002a08-0000-1000-8000-00805f9b34fb", "Date Time");
        attributes.put("00002a85-0000-1000-8000-00805f9b34fb", "Date of Birth");
        attributes.put("00002a0a-0000-1000-8000-00805f9b34fb", "Day Date Time");
        attributes.put("00002a09-0000-1000-8000-00805f9b34fb", "Day of Week");
        attributes.put("00002a7d-0000-1000-8000-00805f9b34fb", "Descriptor Value Changed");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a7b-0000-1000-8000-00805f9b34fb", "Dew Point");
        attributes.put("00002a0d-0000-1000-8000-00805f9b34fb", "DST Offset");
        attributes.put("00002a6c-0000-1000-8000-00805f9b34fb", "Elevation");
        attributes.put("00002a87-0000-1000-8000-00805f9b34fb", "Email Address");
        attributes.put("00002a0c-0000-1000-8000-00805f9b34fb", "Exact Time 256");
        attributes.put("00002a88-0000-1000-8000-00805f9b34fb", "Fat Burn Heart Rate Lower Limit");
        attributes.put("00002a89-0000-1000-8000-00805f9b34fb", "Fat Burn Heart Rate Upper Limit");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
        attributes.put("00002a8a-0000-1000-8000-00805f9b34fb", "First Name");
        attributes.put("00002a8b-0000-1000-8000-00805f9b34fb", "Five Zone Heart Rate Limits");
        attributes.put("00002a8c-0000-1000-8000-00805f9b34fb", "Gender");
        attributes.put("00002a51-0000-1000-8000-00805f9b34fb", "Glucose Feature");
        attributes.put("00002a18-0000-1000-8000-00805f9b34fb", "Glucose Measurement");
        attributes.put("00002a34-0000-1000-8000-00805f9b34fb", "Glucose Measurement Context");
        attributes.put("00002a74-0000-1000-8000-00805f9b34fb", "Gust Factor");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        attributes.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
        attributes.put("00002a8d-0000-1000-8000-00805f9b34fb", "Heart Rate Max");
        attributes.put(HEART_RATE_MEASUREMENT,                 "Heart Rate Measurement");
        attributes.put("00002a7a-0000-1000-8000-00805f9b34fb", "Heat Index");
        attributes.put("00002a8e-0000-1000-8000-00805f9b34fb", "Height");
        attributes.put("00002a4c-0000-1000-8000-00805f9b34fb", "HID Control Point");
        attributes.put("00002a4a-0000-1000-8000-00805f9b34fb", "HID Information");
        attributes.put("00002a8f-0000-1000-8000-00805f9b34fb", "Hip Circumference");
        attributes.put("00002a6f-0000-1000-8000-00805f9b34fb", "Humidity");
        attributes.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE 11073-20601 Regulatory");
        attributes.put("00002a36-0000-1000-8000-00805f9b34fb", "Intermediate Cuff Pressure");
        attributes.put("00002a1e-0000-1000-8000-00805f9b34fb", "Intermediate Temperature");
        attributes.put("00002a77-0000-1000-8000-00805f9b34fb", "Irradiance");
        attributes.put("00002aa2-0000-1000-8000-00805f9b34fb", "Language");
        attributes.put("00002a90-0000-1000-8000-00805f9b34fb", "Last Name");
        attributes.put("00002a6b-0000-1000-8000-00805f9b34fb", "LN Control Point");
        attributes.put("00002a6a-0000-1000-8000-00805f9b34fb", "LN Feature");
        attributes.put("00002a0f-0000-1000-8000-00805f9b34fb", "Local Time Information");
        attributes.put("00002a67-0000-1000-8000-00805f9b34fb", "Location and Speed");
        attributes.put("00002a2c-0000-1000-8000-00805f9b34fb", "Magnetic Declination");
        attributes.put("00002aa0-0000-1000-8000-00805f9b34fb", "Magnetic Flux Density - 2D");
        attributes.put("00002aa1-0000-1000-8000-00805f9b34fb", "Location and Speed - 3D");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a91-0000-1000-8000-00805f9b34fb", "Maximum Recommended Heart Rate");
        attributes.put("00002a21-0000-1000-8000-00805f9b34fb", "Measurement Interval");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number String");
        attributes.put("00002a68-0000-1000-8000-00805f9b34fb", "Navigation");
        attributes.put("00002a46-0000-1000-8000-00805f9b34fb", "New Alert");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy Flag");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb", "PnP");
        attributes.put("00002a75-0000-1000-8000-00805f9b34fb", "Pollen Concentration");
        attributes.put("00002a69-0000-1000-8000-00805f9b34fb", "Position Quality");
        attributes.put("00002a6d-0000-1000-8000-00805f9b34fb", "Pressure");
        attributes.put("00002a4e-0000-1000-8000-00805f9b34fb", "Protocol Mode");
        attributes.put("00002a78-0000-1000-8000-00805f9b34fb", "Rainfall");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
        attributes.put("00002a52-0000-1000-8000-00805f9b34fb", "Record Access Control Point");
        attributes.put("00002a14-0000-1000-8000-00805f9b34fb", "Reference Time Information");
        attributes.put("00002a4d-0000-1000-8000-00805f9b34fb", "Report");
        attributes.put("00002a4b-0000-1000-8000-00805f9b34fb", "Report Map");
        attributes.put("00002a92-0000-1000-8000-00805f9b34fb", "Resting Heart Rate");
        attributes.put("00002a40-0000-1000-8000-00805f9b34fb", "Ringer Control Point");
        attributes.put("00002a41-0000-1000-8000-00805f9b34fb", "Ringer Setting");
        attributes.put("00002a53-0000-1000-8000-00805f9b34fb", "RSC Measurement");
        attributes.put("00002a54-0000-1000-8000-00805f9b34fb", "RSC Feature");
        attributes.put("00002a55-0000-1000-8000-00805f9b34fb", "SC Control Point");
        attributes.put("00002a4f-0000-1000-8000-00805f9b34fb", "Scan Interval Window");
        attributes.put("00002a31-0000-1000-8000-00805f9b34fb", "Scan Refresh");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        attributes.put("00002a5d-0000-1000-8000-00805f9b34fb", "Sensor Location");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        attributes.put("00002a93-0000-1000-8000-00805f9b34fb", "Sport Type for Aerobic and Anaerobic Thresholds");
        attributes.put("00002a47-0000-1000-8000-00805f9b34fb", "Supported New Alert Category");
        attributes.put("00002a48-0000-1000-8000-00805f9b34fb", "Supported Unread Alert Category");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        attributes.put("00002a6e-0000-1000-8000-00805f9b34fb", "Temperature");
        attributes.put("00002a1c-0000-1000-8000-00805f9b34fb", "Temperature Measurement");
        attributes.put("00002a1d-0000-1000-8000-00805f9b34fb", "Temperature Type");
        attributes.put("00002a12-0000-1000-8000-00805f9b34fb", "Time Accuracy");
        attributes.put("00002a13-0000-1000-8000-00805f9b34fb", "Time Source");
        attributes.put("00002a16-0000-1000-8000-00805f9b34fb", "Time Update Control Point");
        attributes.put("00002a17-0000-1000-8000-00805f9b34fb", "Time Update State");
        attributes.put("00002a11-0000-1000-8000-00805f9b34fb", "Time with DST");
        attributes.put("00002a0e-0000-1000-8000-00805f9b34fb", "Time Zone");
        attributes.put("00002a70-0000-1000-8000-00805f9b34fb", "True Wind Speed");
        attributes.put("00002a71-0000-1000-8000-00805f9b34fb", "True Wind Direction");
        attributes.put("00002a94-0000-1000-8000-00805f9b34fb", "Three Zone Heart Rate Limits");
        attributes.put("00002a95-0000-1000-8000-00805f9b34fb", "Two Zone Heart Rate Limit");
        attributes.put("00002a07-0000-1000-8000-00805f9b34fb", "Tx Power Level");
        attributes.put("00002a45-0000-1000-8000-00805f9b34fb", "Unread Alert Status");
        attributes.put("00002A9f-0000-1000-8000-00805f9b34fb", "User Control Point");
        attributes.put("00002A9a-0000-1000-8000-00805f9b34fb", "User Index");
        attributes.put("00002A76-0000-1000-8000-00805f9b34fb", "UV Index");
        attributes.put("00002A96-0000-1000-8000-00805f9b34fb", "VO2 Max");
        attributes.put("00002A97-0000-1000-8000-00805f9b34fb", "Waist Circumference");
        attributes.put("00002A9E-0000-1000-8000-00805f9b34fb", "Weight Scale Feature");
        attributes.put("00002A98-0000-1000-8000-00805f9b34fb", "Weight Measurement");
        attributes.put("00002A79-0000-1000-8000-00805f9b34fb", "Wind Chill");
    }

    // See: https://www.bluetooth.org/en-us/specification/assigned-numbers/company-identifiers
    private static HashMap<Integer, String> deviceManufacturer = new HashMap<Integer, String>();
    static {
        deviceManufacturer.put(0,"Ericsson Technology Licensing");
        deviceManufacturer.put(1,"Nokia Mobile Phones");
        deviceManufacturer.put(2,"Intel Corp.");
        deviceManufacturer.put(3,"IBM Corp.");
        deviceManufacturer.put(4,"Toshiba Corp.");
        deviceManufacturer.put(5,"3Com");
        deviceManufacturer.put(6,"Microsoft");
        deviceManufacturer.put(7,"Microsoft");
        deviceManufacturer.put(8,"Motorola");
        deviceManufacturer.put(10,"Cambridge Silicon Radio");
        deviceManufacturer.put(13,"Texas Instruments Inc.");
        deviceManufacturer.put(26,"TTPCom Limited");
        deviceManufacturer.put(29,"Qualcomm");
        deviceManufacturer.put(76,"Apple, Inc.");
        deviceManufacturer.put(67,"PARROT SA");
        deviceManufacturer.put(85,"Plantronics, Inc.");
        deviceManufacturer.put(86,"Sony Ericsson Mobile Communications");
        deviceManufacturer.put(107,"Polar Electro OY");
        deviceManufacturer.put(117,"Samsung Electronics Co. Ltd.");
        deviceManufacturer.put(118,"Creative Technology Ltd.");
        deviceManufacturer.put(120,"Nike, Inc.");
        deviceManufacturer.put(138,"Jawbone");
        deviceManufacturer.put(158,"Bose Corporation");
        deviceManufacturer.put(195,"adidas AG");
        deviceManufacturer.put(196,"​​LG Electronics​");
        deviceManufacturer.put(204,"Beats Electronics");
        deviceManufacturer.put(209,"Polar Electro Europe B.V.​");
        deviceManufacturer.put(214,"Timex Group USA, Inc.");
        deviceManufacturer.put(224,"Google");
        deviceManufacturer.put(301,"Sony");
        deviceManufacturer.put(368,"Roche Diabetes Care AG");
        deviceManufacturer.put(376,"CASIO COMPUTER CO., LTD.");
        deviceManufacturer.put(398,"Fitbit, Inc.");
        deviceManufacturer.put(508,"Wahoo Fitness, LLC​");
        deviceManufacturer.put(515,"​​Kemppi Oy​");
        deviceManufacturer.put(65535,"​​Test​");
    }

    private static HashMap<Integer, String> healthDeviceProfile = new HashMap<Integer, String>();
    static {
        healthDeviceProfile.put(4100,"​​Pulse Oximeter​");
        healthDeviceProfile.put(4102,"​​Basic ECG (heart rate)​");
        healthDeviceProfile.put(4103,"Blood Pressure Monitor");
        healthDeviceProfile.put(4111,"​​Body Thermometer​");
        healthDeviceProfile.put(4113,"​​Glucose Meter​");
        healthDeviceProfile.put(4114,"​​International Normalized Ratio (INR) Monitor​");
        healthDeviceProfile.put(4116,"​​Body Composition Analyzer​");
        healthDeviceProfile.put(4117,"​​Peak Flow Monitor​");
        healthDeviceProfile.put(4137,"​​Cardiovascular Fitness and Activity Monitor​");
        healthDeviceProfile.put(4200,"​​Step Counter based on 10441​");
        healthDeviceProfile.put(4138,"​​Strength Fitness Equipment​");
        healthDeviceProfile.put(4167,"​​Independent Living Activity Hub");
        healthDeviceProfile.put(4213,"Fall Sensor​");
        healthDeviceProfile.put(4214,"Personal Emergency Response Sensor​");
        healthDeviceProfile.put(4215,"Smoke Sensor​");
        healthDeviceProfile.put(4216,"Carbon Monoxide (CO) Sensor​");
        healthDeviceProfile.put(4217,"Water Sensor");
        healthDeviceProfile.put(4218,"Gas Sensor");
        healthDeviceProfile.put(4219,"Motion Sensor");
        healthDeviceProfile.put(4220,"Property Exit Sensor");
        healthDeviceProfile.put(4221,"Enuresis Sensor​");
        healthDeviceProfile.put(4222,"Contact Closure Sensor​");
        healthDeviceProfile.put(4223,"Usage Sensor​");
        healthDeviceProfile.put(4224,"Switch Sensor");
        healthDeviceProfile.put(4225,"Medication Dosing Sensor​");
        healthDeviceProfile.put(4226,"Temperature Sensor​");
        healthDeviceProfile.put(4168,"​​Medication monitor​");
    }

    private static HashMap<Integer, String> sensorLocations = new HashMap<Integer, String>();
    static {
        sensorLocations.put(0, "​​Other​");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
