package org.firstinspires.ftc.teamcode.Teaching.People.Joel;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Drivetrain {
    public final DcMotor leftRear, leftFront, rightFront, rightRear;
    public final Gamepad gamepad1;
    public HardwareMap hardwareMap;
    public Telemetry telemetry;
    public Drivetrain(OpMode opMode) {

        this.gamepad1 = opMode.gamepad1;
        this.hardwareMap = opMode.hardwareMap;
        this.telemetry = opMode.telemetry;

        leftFront = (DcMotor) hardwareMap.get("leftFront");
        leftRear = (DcMotor) hardwareMap.get("leftRear");
        rightFront = (DcMotor) hardwareMap.get("rightFront");
        rightRear = (DcMotor) hardwareMap.get("rightRear");
    }

}
