/**
 * 
 */
package com.michael.adkins.socialnetwork.entity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

/**
 * @author micha
 *
 */
@Component
public class UserDao {
	private static Map<Integer, User> userMap = new HashMap<>();
//	private Map<Vertex, List<Vertex>> adjVertices;
	private static Random random = new Random();

	static {
		User[] userArr = {
				new User(0, "Petra", "Nemcova", "Cubanova",
						new Calendar.Builder().setDate(1979, 6, 24).build().getTime()),
				new User(1, "Natalya", "", "Nemchinova", new Calendar.Builder().setDate(1991, 1, 14).build().getTime()),
				new User(2, "Natalia", "", "Poklonskaya",
						new Calendar.Builder().setDate(1980, 3, 18).build().getTime()) };
		userMap = IntStream.range(0, userArr.length / 2).map(i -> i * 2).collect(HashMap::new,
				(newMap, index) -> newMap.put(index, userArr[index]), Map::putAll);

	}

	public List<User> findAll() {
		return List.copyOf(userMap.values());
	}

	public User findOne(int id) {
		return userMap.get(id);
	}

	public User save(User user) {
		if (user.getId() == null) {
			Integer key = createId();
			user.setId(key);
		}
		userMap.put(user.getId(), user);
		return user;
	}

	private static Integer createId() {
		Integer key = null;
		Set<Integer> keySet = userMap.keySet();
		do {
			try {
				key = random.nextInt(keySet.size());
			} catch (IllegalArgumentException e) {
				key = 0;
			}
		} while (keySet.contains(key) && keySet.size() > 0);
		return key;
	}
}
