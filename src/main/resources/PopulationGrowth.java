import java.lang.Math;
class PopulationGrowth {
    public static int nbYear(int p0, double percent, int aug, int p) {
        /*
        p0 - нынешнее население/current population
        percent - насколько процентов растёт население в год/pop. growth percent
        aug - иммигранты приезжающие/immigrants
        p - сколько нужно в итоге/pop. that we need

        */
        int i = 0;//Представление кол-ва лет, что потребуется для роста населения до P/making instance of years, that we need to get full population.

        while (p0 < p){
            int popInc = (int) (p0*percent*0.01);
            p0 = p0 + popInc + aug;
            i++;
        }
        return i;
    }
}