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
        List<Interval> list = new ArrayList<>();
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> a.start - b.start);
        for (int i = 0; i < schedule.size(); i++) {
            for (Interval interval : schedule.get(i)) {
                pq.offer(interval);
            }
        }
        Interval prev = pq.poll();
        while (!pq.isEmpty()) {
            Interval current = pq.poll();
            if (prev.end < current.start) {
                list.add(new Interval(prev.end, current.start));
                prev = current;
            }
            else {
                prev.end = Math.max(prev.end, current.end);
            }
        }
        return list;
    }
}
