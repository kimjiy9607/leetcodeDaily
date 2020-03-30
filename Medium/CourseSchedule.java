import java.util.*;

public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites){
		List<List<Integer>>courses = new ArrayList<>(numCourses);
		for(int i=0; i<numCourses; i++){
			courses.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<prerequisites.length; i++){
			courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
		int[] visited = new int[numCourses];
		boolean[] memo = new boolean[numCourses];
		for(int i=0; i<numCourses; i++){
			if(!dfs(i, courses, memo, visited)) return false;
		}
		return true;
	}
	
	private boolean dfs(int course, List<List<Integer>>courses, boolean[] memo, int[] visited){
		if(visited[course]==1) return false;
		if(memo[course]) return true;
		visited[course] = 1;
		List<Integer> canTake = courses.get(course);
		for(int i=0; i<canTake.size(); i++){
			int c = canTake.get(i);
			if(!dfs((int)c, courses, memo, visited)) return false;
		}
		visited[course] = 2;
		memo[course]= true;
		return true;
	}
}
