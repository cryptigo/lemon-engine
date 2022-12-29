package util;

import lemon.Window;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.SoundCard;

import java.awt.*;

public class SystemUtils {

    // -------------------------------------------------
    // GPU / Display
    // -------------------------------------------------

    public static String getGPUName() {
        return getGPUName(1);
    }

    public static String getGPUName(int index) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        GraphicsCard gpu = hal.getGraphicsCards().get(index);
        return gpu.getName();
    }

    public static long getAvailableVRam() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        GraphicsCard gpu = hal.getGraphicsCards().get(1);

        // Return in MB
        return (gpu.getVRam() / 1000000);
    }

    public static double getTrueScreenWidth() {
        return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    }

    public static double getTrueScreenHeight() {
        return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }

    // -------------------------------------------------
    // CPU / Memory
    // -------------------------------------------------

    public static long getCPUMaxFreq() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        CentralProcessor cpu = hal.getProcessor();
        return cpu.getMaxFreq();
    }

    // -------------------------------------------------
    // SOUND CARD
    // -------------------------------------------------

    public static String getSoundCardName() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        SoundCard sc = hal.getSoundCards().get(1);
        return sc.getName();
    }

    public static String getSoundCardCodec() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        SoundCard sc = hal.getSoundCards().get(1);
        return sc.getCodec();
    }

    public static String getSoundCardVersion() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        SoundCard sc = hal.getSoundCards().get(1);
        return sc.getDriverVersion();
    }


}
