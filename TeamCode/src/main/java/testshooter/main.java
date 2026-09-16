package testshooter;
import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;
import com.pedropathing.math.MathFunctions;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp

public class main extends OpMode {
    motorservo motorservo = new motorservo();
    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
    double power;
    @Override
    public void init() {
        motorservo.init(hardwareMap, this);
    }

    @Override
    public void loop() {
        if (gamepad1.dpadUpWasPressed() ) {
            power += 0.1;
            panelsTelemetry.update(telemetry);

        }
        if (gamepad1.dpadDownWasPressed() ) {
            power -= 0.1;
            panelsTelemetry.update(telemetry);

        }
        power = MathFunctions.clamp(power, -1.0, 1.0);

        motorservo.claw();

        motorservo.shooter(power);

        panelsTelemetry.addData("ShooterPower ",motorservo.shooter1.getPower());
        panelsTelemetry.update(telemetry);


    }
}