//package org.firstinspires.ftc.FTC26_11052.OpMode;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import com.pedropathing.geometry.Pose;
//import com.pedropathing.follower.Follower;
//
////import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
////import org.firstinspires.ftc.FTC26_11052.hardware.shooter;
//import org.firstinspires.ftc.FTC26_11052.hardware.turret;
////import org.firstinspires.ftc.FTC26_11052.hardware.intake;
////import org.firstinspires.ftc.FTC26_11052.pedroPathing.Constants;
////import org.firstinspires.ftc.FTC26_11052.software.AprilTag;
////import org.firstinspires.ftc.FTC26_11052.software.PosDB;
//
//import com.qualcomm.hardware.lynx.LynxModule;
//
//@Configurable
//@TeleOp
//public class FTC2026_Manual extends LinearOpMode {
////    MecanumDrive drive = new MecanumDrive();
//    shooter Shooter = new shooter();
////    turret Turret = new turret();
//    intake Intake = new intake();
//  //  PosDB posDB = new PosDB();
//    ElapsedTime timer = new ElapsedTime();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    Follower follower;
//    Pose robotpos;
//    LynxModule controlHub;
//    boolean AUTO;
//    @Override
//    public void runOpMode(){
//        //drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        Shooter.init(hardwareMap);
//   //     Turret.init(hardwareMap);
//        Intake.init(hardwareMap,this);
//
//        controlHub=hardwareMap.get(LynxModule.class,"Control Hub");
//        controlHub.setBulkCachingMode(LynxModule.BulkCachingMode.MANUAL);
//
////        follower=Constants.createFollower(hardwareMap);
////        follower.setStartingPose(posDB.pos);
////        follower.update();
//
//        panelsTelemetry.setUpdateInterval(500);
//        panelsTelemetry.addLine("<FTC2026_Manual>");
//        panelsTelemetry.addLine("Status: Initialized");
//        panelsTelemetry.update(telemetry);
//
//        timer.reset();
//
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            follower.getVelocity().getXComponent();
//            controlHub.clearBulkCache();
//            follower.update();
//            robotpos=follower.getPose();
////            Intake.IntakeAuto();
//            //drive.RobotCentric();
//            panelsTelemetry.addLine("<FTC2026_Manual>");
//            panelsTelemetry.addLine("Status: Running");
//            panelsTelemetry.addData("Runtime(Second)",timer.seconds());
//            panelsTelemetry.update(telemetry);
//        }
//    }
//}