package org.firstinspires.ftc.teamcode.Teaching.TeleOp;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class SensorSub {
    public HardwareMap hardwareMap;
    public Telemetry telemetry;
    public Sensor(OpMode opMode) {
        this.hardwareMap = opMode.hardwareMap;
        this.telemetry = opMode.telemetry;
    }
}
