//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
////import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//
//@TeleOp
//public class hardwareTest extends LinearOpMode{
////    MecanumDrive drive = new MecanumDrive();
//    intake Intake = new intake();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    @Override
//    public void runOpMode(){
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        Intake.init(hardwareMap,this);
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//     //       panelsTelemetry.addData("Intake Distance sensor",Intake.full.getDistance(DistanceUnit.CM));
//            panelsTelemetry.update(telemetry);
//   //         Intake.IntakeAuto();
//            drive.RobotCentric();
//        }
//    }
//}