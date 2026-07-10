//package org.firstinspires.ftc.FTC26_11052.test;
//
//import com.bylazar.configurables.annotations.Configurable;
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.Servo;
//
//@Configurable
//@TeleOp
//public class ServoTest extends LinearOpMode {
//    Servo servo;
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    public static double ServoPos=0;
//    @Override
//    public void runOpMode(){
//        servo=hardwareMap.servo.get("servo");
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addData("ServoPos",ServoPos);
//            panelsTelemetry.update(telemetry);
//            servo.setPosition(ServoPos);
//        }
//    }
//}