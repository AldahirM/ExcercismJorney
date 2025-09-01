
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int getToday() {
        int today = birdsPerDay.length - 1;
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        int today = birdsPerDay.length - 1;
        birdsPerDay[today]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > birdsPerDay.length - 1) {
            for (int i = 0; i < birdsPerDay.length; i++) {
                count += birdsPerDay[i];
            }
            return count;
        }
        for (int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                count ++;
            }
        }
        return count;
    }
}
