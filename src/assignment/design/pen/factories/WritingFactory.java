package assignment.design.pen.factories;

import assignment.design.pen.entities.PenType;
import assignment.design.pen.statergies.BallPenStrategy;
import assignment.design.pen.statergies.GelPenStrategy;
import assignment.design.pen.statergies.WritingStrategy;

/**
 * Writing Factory for writing strategy!!!
 */
public class WritingFactory {

    public static WritingStrategy writingStrategy = null;

    public static WritingStrategy getWritingStrategy(PenType penType){

            if(penType == PenType.BALL_PEN){
                    writingStrategy = new BallPenStrategy();
            } else if(penType == PenType.GEL_PEN) {
                    writingStrategy = new GelPenStrategy();
            }
            return writingStrategy;
    }

}
