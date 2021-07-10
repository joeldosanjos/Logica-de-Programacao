float func1(float value, int installment, int interest)
{
    int i;

    for(i=0;i<installment;i++)
    {
        value = value * ((interest/100.0) + 1.0);
    }

    return value = value / installment;
}
