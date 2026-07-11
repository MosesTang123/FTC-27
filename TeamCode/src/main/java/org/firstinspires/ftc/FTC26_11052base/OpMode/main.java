package org.firstinspires.ftc.FTC26_11052base.OpMode;

import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "IDK2 Fixed")
public class main extends OpMode {

    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();



    motorservo motorservo = new motorservo();
    motordrivetrain drive = new motordrivetrain();

    double target = 1;

    @Override
    public void init() {

        motorservo.init(hardwareMap,this );
        drive.init(hardwareMap,this );
    }

    @Override
    public void loop() {
        motorservo.intake(-1);
        motorservo.shooter(0.5);
        motorservo.servo1(0.15);
        motorservo.servo2(0.35);
        drive.drive(-gamepad1.left_stick_y, gamepad1.left_stick_x);




    }

}

