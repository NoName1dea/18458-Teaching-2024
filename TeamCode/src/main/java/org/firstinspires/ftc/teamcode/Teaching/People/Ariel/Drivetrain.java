package org.firstinspires.ftc.teamcode.Teaching.People.Ariel;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp
public class Drivetrain extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //type name  = (restate type) library. going to get it("string/name")

        DcMotor frontRight = (DcMotor) hardwareMap.get("frontRight");
        DcMotor frontLeft = (DcMotor) hardwareMap.get("frontLeft");
        DcMotor backRight = (DcMotor) hardwareMap.get("backRight");
        DcMotor backLeft = (DcMotor) hardwareMap.get("backLeft");
        //change directions
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        //brake
        frontLeft.setZeroPowerBehavior(BRAKE);
        frontRight.setZeroPowerBehavior(BRAKE);
        backLeft.setZeroPowerBehavior(BRAKE);
        backRight.setZeroPowerBehavior(BRAKE);



        waitForStart();
        //while everything is active, it will repeat or check for the values given
        while (opModeIsActive()) {

           // double frontRight;
           // if (gamepad1.left_stick_y > 0.2){
             //   frontRight = 1;
         //   }
           // else if (gamepad1.left_stick_y < -0.2){
             //   frontRight = -1;
            }
           // else {
               // frontRight = 0;
           // }


            // frontLeft.setPower()

            //Forward & Backward
            if (gamepad1.left_stick_y > 0.2) {
//               // name of motor/set power, max is 1
                frontRight.setPower(gamepad1.left_stick_y);
                frontLeft.setPower(1);
                backRight.setPower(1);
                backLeft.setPower(1);
            } else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }
            if (gamepad1.left_stick_y < -0.2) {
                frontRight.setPower(-1);
                frontLeft.setPower(-1);
                backRight.setPower(-1);
                backLeft.setPower(-1);
            } else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }

            //Straffing
            //x-axis of right stick
            if (gamepad1.left_stick_x > 0.2) {
                frontRight.setPower(1);
                frontLeft.setPower(-1);
                backRight.setPower(-1);
                backLeft.setPower(1);
            } else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }
            if (gamepad1.left_stick_x < -0.2) {
                frontRight.setPower(-1);
                frontLeft.setPower(1);
                backRight.setPower(1);
                backLeft.setPower(-1);
            }
            else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }

            //rotation or turning
            //- is right
            if (gamepad1.right_stick_x < -0.2) {
                frontRight.setPower(-1);
                frontLeft.setPower(1);
                backRight.setPower(-1);
                backLeft.setPower(1);
            }
            else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }
            // positive # is left
            if (gamepad1.right_stick_x > 0.2) {
                frontRight.setPower(1);
                frontLeft.setPower(-1);
                backRight.setPower(1);
                backLeft.setPower(-1);
            }
            else {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }
    }

}
