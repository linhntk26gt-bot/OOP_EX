package bai1.ex1_8;

public class Time {
    int hour;
    int min;
    int sec;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    public int getSecond() {
        return sec;
    }

    public void setSecond(int sec) {
        this.sec = sec;
    }

    public int getMinute() {
        return min;
    }

    public void setMinute(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setTime(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    public Time nextSecond() {
        this.sec++;

        if (this.sec >= 60) {
            this.sec = 0;
            this.min++;

            // 3. Nếu phút chạm 60, reset về 0 và tăng giờ thêm 1
            if (this.min >= 60) {
                this.min = 0;
                this.hour++;

                // 4. Nếu giờ chạm 24, reset về 0 (chu kỳ ngày mới)
                if (this.hour >= 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        this.sec--;

        if (this.sec < 60) {
            this.sec = 0;
            this.min--;

            // 3. Nếu phút chạm 60, reset về 0 và tăng giờ thêm 1
            if (this.min < 60) {
                this.min = 0;
                this.hour --;

                // 4. Nếu giờ chạm 24, reset về 0 (chu kỳ ngày mới)
                if (this.hour < 24) {
                    this.hour = 0;
                }
            }
        }
        return this;

    }
}
