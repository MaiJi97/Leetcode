/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/

class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> a.start - b.start);
        for (List<Interval> employee : schedule) {
            for (Interval i : employee) {
                pq.offer(i);
            }
        }
        List<Interval> ret = new ArrayList<>();
        Interval newInterval = pq.peek();
        while (!pq.isEmpty()) {
            Interval interval = pq.poll();
            if (interval.start > newInterval.end) {
                ret.add(new Interval(newInterval.end, interval.start));
                newInterval = interval;
            }
            else newInterval.end = Math.max(newInterval.end, interval.end);
        }
        return ret;
    }
}
