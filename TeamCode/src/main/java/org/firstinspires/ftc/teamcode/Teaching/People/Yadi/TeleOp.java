package org.firstinspires.ftc.teamcode.Teaching.People.Yadi;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
public class TeleOp extends LinearOpMode {
    DcMotor motor;
    Servo servo1;
    double POWER = 0.5;
    @Override
    public void runOpMode() throws InterruptedException {
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setDirection(DcMotorSimple.Direction.FORWARD);
        servo1.setDirection(Servo.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()) {
            intakeMotor();
        }
    }
    public void intakeMotor() {
        if (gamepad1.left_trigger == 0.5) {
            motor.setPower(POWER);
        }
        if (gamepad1.cross) {
            servo1.setPosition(0.5);

        }
    }
}