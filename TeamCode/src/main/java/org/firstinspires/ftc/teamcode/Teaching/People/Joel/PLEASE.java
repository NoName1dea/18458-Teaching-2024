package org.firstinspires.ftc.teamcode.Teaching.People.Joel;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class PLEASE extends LinearOpMode {
    public DcMotor motor;
    public Servo servo;
    public Gamepad gamepad;
    @Override
    public void runOpMode() throws InterruptedException {
        while (opModeIsActive()) {
            if (gamepad1.cross) {
                motor.setPower(0);
            }
        }
    }
}
