package cf;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class FlightCalculationsService {

    public BigDecimal calculateTotalFuelConsumption(BigDecimal fuelConsumptionRate,
                                                    BigDecimal distance,
                                                    int scaleValue,
                                                    String roundingModeValue) throws IOException {

        BigDecimal totalFuel = fuelConsumptionRate.multiply(distance);

        return totalFuel.setScale(scaleValue,
                RoundingMode.valueOf(roundingModeValue));
    }

    public BigDecimal calculateTotalFuelCost(BigDecimal totalFuelConsumption,
                                             BigDecimal fuelCostPerGallon,
                                             int scaleValue,
                                             String roundingModeValue) throws IOException {

        BigDecimal totalCost = totalFuelConsumption.multiply(fuelCostPerGallon);

        return totalCost.setScale(scaleValue,
                RoundingMode.valueOf(roundingModeValue));
    }

    public BigDecimal calculateAverageFuelEfficiency(BigDecimal distance,
                                                     BigDecimal totalFuelConsumption,
                                                     int scaleValue,
                                                     String roundingModeValue) throws IOException {

        BigDecimal avgEfficiency = distance.divide(totalFuelConsumption,
                scaleValue,
                RoundingMode.valueOf(roundingModeValue));

        return avgEfficiency.setScale(scaleValue,
                RoundingMode.valueOf(roundingModeValue));
    }
}