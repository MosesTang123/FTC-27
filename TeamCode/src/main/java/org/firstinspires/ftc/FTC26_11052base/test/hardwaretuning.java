//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.pedropathing.follower.Follower;
//import com.pedropathing.geometry.Pose;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
//import org.firstinspires.ftc.FTC26_11052.hardware.shooter;
//import org.firstinspires.ftc.FTC26_11052.hardware.turret;
//import org.firstinspires.ftc.FTC26_11052.pedroPathing.Constants;
//@Configurable
//@TeleOp
//public class hardwaretuning extends LinearOpMode{
//    MecanumDrive drive = new MecanumDrive();
//    intake Intake = new intake();
//    shooter Shooter = new shooter();
//    turret Turret = new turret();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    Follower follower;
//    double goaldis;
//    public static double target=0,itarget=0,adjustpos=0,stoppos=0;
//    @Override
//    public void runOpMode(){
//        Turret.init(hardwareMap);
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        Intake.init(hardwareMap,this);
//        Shooter.init(hardwareMap);
//        follower= Constants.createFollower(hardwareMap);
//        follower.setStartingPose(new Pose(144,144,Math.toRadians(0)));
//        follower.update();
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("robot pos x",follower.getPose().getX());
//            panelsTelemetry.addData("robot pos y",follower.getPose().getY());
//            panelsTelemetry.addData("shooter velocity",Shooter.shooter1.getVelocity());
//            panelsTelemetry.addData("goaldis",goaldis);
//            panelsTelemetry.update(telemetry);
//
//            goaldis=Math.sqrt(Math.pow(Math.abs(185-follower.getPose().getX()),2)+Math.pow(Math.abs(185-follower.getPose().getY()),2));
//            goaldis*=2.54;
//            follower.update();
//            drive.RobotCentric();
//            Turret.turretmotor.setPower(Turret.pidfoutput(0));
//            Intake.run(itarget);
//            Shooter.run(target);
//            Intake.stopper.setPosition(stoppos);
//            Shooter.adjust.setPosition(adjustpos);
//        }
//    }
//}