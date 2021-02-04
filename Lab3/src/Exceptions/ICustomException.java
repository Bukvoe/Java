package Exceptions;

public interface ICustomException {
    public final String STRING_EMPTY_MESSAGE = "cannot be empty.";
    public final String NEGATIVE_NUMBER_MESSAGE = "cannot be less than or equal to 0.";
    default String IsCorrectString(String param)
    {
        if(param.isBlank())
            throw new IllegalArgumentException(String.format("%s " + STRING_EMPTY_MESSAGE, param));
        return param;
    }
    default int IsNegativeIntNumber(int param)
    {
        if(param < 0)
            throw new IllegalArgumentException(String.format("%s " + NEGATIVE_NUMBER_MESSAGE, param));
        return param;
    }
    default float IsNegativeFloatNumber(float param)
    {
        if(param < 0.0f)
            throw new IllegalArgumentException(String.format("%s " + NEGATIVE_NUMBER_MESSAGE, param));
        return param;
    }
}
