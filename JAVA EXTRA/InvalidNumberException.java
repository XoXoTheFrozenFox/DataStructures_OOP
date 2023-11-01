public class InvalidNumberException extends RuntimeException
{
    public InvalidNumberException()
    {
        this("The number is invalid");
    }

    public InvalidNumberException(String message)
    {
        super(message);
    }
}