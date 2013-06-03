package de.unihalle.sim.entities;

import org.mitre.sim.DefaultEntity;

import de.unihalle.sim.main.BeeSimulation;
import de.unihalle.sim.util.Position;

public abstract class PositionedEntity extends DefaultEntity {

	protected Position _position;

	/**
	 * Returns a defensive copy of the entity position.
	 * 
	 * @return entity position
	 */
	public Position getPosition() {
		return Position.createFromPosition(_position);
	}

	/**
	 * The entity notifies the simulation with the specified message and its position.
	 * 
	 * @param message
	 */
	public void infoWithPosition(String message) {
		BeeSimulation.getListener().notify(this);
		info(getPosition() + " " + message);
	}

	@Override
	public boolean equals(Object o) {
		if (PositionedEntity.class.isAssignableFrom(o.getClass())) {
			PositionedEntity bee = (PositionedEntity) o;
			return bee.getName().equals(getName()) && bee.getPosition().equals(getPosition());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (getName() + getPosition()).hashCode();
	}

}
