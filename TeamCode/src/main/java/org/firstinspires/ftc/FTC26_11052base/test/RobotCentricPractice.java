//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.pedropathing.follower.Follower;
//import com.pedropathing.geometry.Pose;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
//import org.firstinspires.ftc.FTC26_11052.hardware.shooter;
//import org.firstinspires.ftc.FTC26_11052.hardware.turret;
//import org.firstinspires.ftc.FTC26_11052.pedroPathing.Constants;
//
//@TeleOp
//public class RobotCentricPractice extends LinearOpMode{
//    ElapsedTime loop = new ElapsedTime();
//    MecanumDrive drive = new MecanumDrive();
//    intake Intake = new intake();
//    shooter Shooter = new shooter();
//    turret Turret = new turret();
//    Follower follower;
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    @Override
//    public void runOpMode(){
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        Intake.init(hardwareMap,this);
//        Shooter.init(hardwareMap);
//        Turret.init(hardwareMap);
//        loop.reset();
//        follower= Constants.createFollower(hardwareMap);
//        follower.setStartingPose(new Pose(144,144, Math.toRadians(0)));
//        follower.update();
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("Loop time",loop.milliseconds());
//            panelsTelemetry.update(telemetry);
//            panelsTelemetry.addData("robot pos x",follower.getPose().getX());
//            panelsTelemetry.addData("robot pos y",follower.getPose().getY());
//            panelsTelemetry.addData("shooter velocity",Shooter.shooter1.getVelocity());
//            loop.reset();
//            follower.update();
//            Intake.IntakeAuto();
//            Turret.turretmotor.setPower(Turret.pidfoutput(0));
//            Shooter.run(Shooter.getVelocity(follower.getPose()));
//            Shooter.adjust.setPosition(Shooter.getAngle(follower.getPose()));
//            drive.RobotCentric();
//
//        }
//    }
//}