//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
//import org.firstinspires.ftc.FTC26_11052.hardware.shooter;
//
//@TeleOp
//@Configurable
//public class ShooterTuner extends LinearOpMode{
//    shooter Shooter = new shooter();
//    MecanumDrive drive = new MecanumDrive();
//    intake Intake = new intake();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    public static double kp=0.01,ki=0,kd=0,kf=0.00039,ks=0.11,target=1500;
//    @Override
//    public void runOpMode(){
//        Intake.init(hardwareMap,this);
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        Shooter.init(hardwareMap);
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("Velocity: ",Shooter.shooter1.getVelocity());
//            panelsTelemetry.addData("Target: ",target);
//            panelsTelemetry.update(telemetry);
//            Shooter.run(kp,ki,kd,kf,ks,target);
//        }
//    }
//}
