package de.unihalle.sim.main;

import java.util.Random;

import de.unihalle.sim.util.MovementUtil;
import de.unihalle.sim.util.TimeUtil;

public class InputData {

	private Random _random = new Random();
	// environmental data
	private int _numberOfFlowersPerBee = 8;
	private int _numberOfBeesPerHive = 2;

	// hive data
	private double _eggSpawnRate = TimeUtil.seconds(43.2);
	private double _initialInfectionPercentage = 0.01;
	private double _workerBeePercentage = 0.55;
	private double _collapseThreshold = 0.75;

	// bee data
	private double _flyBackToWrongHiveChance = 0.30;
	private double _infectionProbability = 0.1;
	private double _movementSpeed = MovementUtil.kilometersPerHour(5);
	private double _initialTimeToLiveStandardDeviation = TimeUtil.days(5);
	private double _initialTimeToLiveMean = TimeUtil.days(45);
	private double _initialTimeToLiveDueToInfection = TimeUtil.days(4);
	private double _incubationTime = TimeUtil.days(2);
	private double _keepAliveTimer = TimeUtil.minutes(1);
	private double _nectarStoreTime = TimeUtil.hours(5);
	private double _nectarCollectionTime = TimeUtil.minutes(30);
	private int _beeMaxNectarCapacity = 40;

	// flower data
	private int _flowerMaxNectarCapacity = 16;
	private double _nectarRefreshRate = TimeUtil.days(1) / _flowerMaxNectarCapacity;

	private double sampleGaussian(double mean, double standardDeviation) {
		return _random.nextGaussian() * standardDeviation + mean;
	}

	public int getNumberOfFlowersPerBee() {
		return _numberOfFlowersPerBee;
	}

	public int getNumberOfBeesPerHive() {
		return _numberOfBeesPerHive;
	}

	public double getEggSpawnRate() {
		return _eggSpawnRate;
	}

	public double getWorkerBeePercentage() {
		return _workerBeePercentage;
	}

	public double getInitialInfectionPercentage() {
		return _initialInfectionPercentage;
	}

	public double getFlyBackToWrongHiveChance() {
		return _flyBackToWrongHiveChance;
	}

	public double getInfectionProbability() {
		return _infectionProbability;
	}

	public double getMovementSpeed() {
		return _movementSpeed;
	}

	public double getInitialTimeToLive() {
		return sampleGaussian(_initialTimeToLiveMean, _initialTimeToLiveStandardDeviation);
	}

	public double getInitialTimeToLiveDueToInfection() {
		return _initialTimeToLiveDueToInfection;
	}

	public double getIncubationTime() {
		return _incubationTime;
	}

	public double getKeepAliveTimer() {
		return _keepAliveTimer;
	}

	public double getNectarStoreTime() {
		return _nectarStoreTime;
	}

	public double getNectarCollectionTime() {
		return _nectarCollectionTime;
	}

	public int getBeeMaxNectarCapacity() {
		return _beeMaxNectarCapacity;
	}

	public int getFlowerMaxNectarCapacity() {
		return _flowerMaxNectarCapacity;
	}

	public double getNectarRefreshRate() {
		return _nectarRefreshRate;
	}

	public double getCollapseThreshold() {
		return _collapseThreshold;
	}

}
