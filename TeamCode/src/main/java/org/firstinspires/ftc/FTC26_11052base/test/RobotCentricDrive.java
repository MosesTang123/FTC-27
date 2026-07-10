//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//
//@TeleOp
//public class RobotCentricDrive extends LinearOpMode{
//    MecanumDrive drive = new MecanumDrive();
//
//    @Override
//    public void runOpMode(){
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            drive.RobotCentric();
//        }
//    }
//}