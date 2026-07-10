//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
////import org.firstinspires.ftc.FTC26_11052.software.AprilTag;
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

//@TeleOp
//public class cameratest extends LinearOpMode{
//    AprilTag aprilTag = new AprilTag();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    @Override
//    public void runOpMode(){
//        aprilTag.init(hardwareMap);
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            aprilTag.getTag(24, telemetry);
//            aprilTag.update();
//        }
//    }
//}