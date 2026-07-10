//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.MecanumDrive;
//import org.firstinspires.ftc.FTC26_11052.hardware.intake;
//
//@TeleOp
//@Configurable
//public class IntakeTuner extends LinearOpMode{
//    MecanumDrive drive = new MecanumDrive();
//    intake Intake = new intake();
//    ElapsedTime looptime = new ElapsedTime();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    public static double kp=0,ki=0,kd=0,kf=0,ks=0,target=0;
//
//    @Override
//    public void runOpMode(){
//        panelsTelemetry.setUpdateInterval(100);
//        Intake.init(hardwareMap,this);
//        drive.init(hardwareMap,this, DcMotor.ZeroPowerBehavior.BRAKE);
//        looptime.reset();
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            drive.RobotCentric();
//            panelsTelemetry.addData("looptime ",looptime.milliseconds());
//            panelsTelemetry.addData("Velocity: ",Intake.intake.getVelocity());
//            panelsTelemetry.addData("Target: ",target);
//            panelsTelemetry.update(telemetry);
//            looptime.reset();
//            Intake.intake.setPower(Intake.pidfoutput(kp,ki,kd,kf,ks,target));
//        }
//    }
//}
