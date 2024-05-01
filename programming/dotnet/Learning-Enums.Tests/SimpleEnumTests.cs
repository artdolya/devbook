namespace Learning_Enums.Tests;

public class SimpleEnumTests
{
    [Fact]
    public void SimpleEnumUno_ConvertedToInt_EqualsToOne()
    {
        // Arange
        const int one = 1;
        const SimpleEnum uno = SimpleEnum.Uno;

        // Act
        const int result = (int)uno;

        // Arrange
        Assert.Equal(result, one);
    }

    [Fact]
    public void SimpleEnumTres_ConvertedToInt_EqualsToThree()
    {
        // Arange
        const int three = 3;
        const SimpleEnum tres = SimpleEnum.Tres;

        // Act
        const int result = (int)tres;

        // Arrange
        Assert.Equal(result, three);
    }
}