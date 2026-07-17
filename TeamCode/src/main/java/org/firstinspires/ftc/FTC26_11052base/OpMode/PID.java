//package org.firstinspires.ftc.FTC26_11052base.OpMode;
//import com.pedropathing.geometry.Pose;
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//import com.qualcomm.robotcore.util.ElapsedTime;
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//
//
//@TeleOp
//@Configurable
//public class PID extends LinearOpMode {
//    motorservo shooter = new motorservo();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//
//    public static double kp=0.01,ki=0,kd=0,kf=0.00039,ks=0.11,target=1500;
//    private static double integralsum=0,lasterror=0;
//
//    @Override
//    public void runOpMode(){
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("Velocity: ",shooter.shooter.getVelocity());
//            panelsTelemetry.addData("Target: ",target);
//            panelsTelemetry.update(telemetry);
//            shooter.pidshooter(kp,ki,kd,kf,ks,target);
//        }
//    }
//
//
//}
