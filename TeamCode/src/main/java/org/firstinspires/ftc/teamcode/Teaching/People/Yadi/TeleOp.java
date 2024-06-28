package org.firstinspires.ftc.teamcode.Teaching.People.Yadi;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp
public class OpMode extends LinearOpMode {
    DcMotor motor;
    // int,doubles,String
    Servo servo1, servo2;
    double POWER = 0.5;
    // -1 TO 1 MOTOR
    // 0 to 1 SERVO
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
        if (gamepad1.left_trigger == 0.5 ) {
            motor.setPower(POWER);
        }
        if (gamepad1.cross) {
            servo1.setPosition(0.5);
        }
        servo2.setPosition(0.5);
    }
}