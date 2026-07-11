package org.firstinspires.ftc.FTC26_11052base.OpMode;

import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "IDK2 Fixed")
public class IDK2 extends OpMode {

    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();


    idk Idk = new idk();
    motordrivetrain drive = new motordrivetrain();

    double target = 1;

    @Override
    public void init() {

        Idk.init(hardwareMap,this );
        drive.init(hardwareMap,this );
    }

    @Override
    public void loop() {
        Idk.a(-1,0.5,0 );
        Idk.servo1(0.1);
        Idk.servo2(0.4);
        drive.drive(-gamepad1.left_stick_y, gamepad1.left_stick_x);

    }

}