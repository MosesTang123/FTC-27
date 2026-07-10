//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//
//import org.firstinspires.ftc.FTC26_11052.hardware.turret;
//
//@TeleOp
//@Configurable
//public class TurretTuner extends LinearOpMode{
//    turret Turret = new turret();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    public static double kp=0.05,ki=0,kd=0.00006,ks=0.1,target=0;
//    @Override
//    public void runOpMode(){
//        Turret.init(hardwareMap);
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("Position: ",Turret.turretmotor.getVelocity());
//            panelsTelemetry.addData("Target: ",target);
//            panelsTelemetry.update(telemetry);
//                Turret.turretmotor.setPower(Turret.pidfoutput(kp,ki,kd,ks,target));
//        }
//    }
//}
