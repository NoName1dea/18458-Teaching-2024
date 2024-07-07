package org.firstinspires.ftc.teamcode.Teaching.TeleOp;

import com.acmerobotics.roadrunner.drive.Drive;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

@TeleOp
public class Sensor extends LinearOpMode {
    Sensor sensor;
    HardwareMap hardwareMap;
    SampleMecanumDrive sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        while(opModeIsActive()) {

        }
    }
}
