/**
 * 
 */
package com.michael.adkins.socialnetwork.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author micha
 *
 */
class UserDaoTest {
	private static UserDao dao = new UserDao();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#findAll()}.
	 */
	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#save(com.michael.adkins.devices.management.entity.Device)}.
	 */
	@Test
	void testSaveOneDevice_returnsSameDevice() {
		User user = new User("Petra", "Nemcova", "Cubanova",
				new Calendar.Builder().setDate(1979, 6, 24).build().getTime());
		assertEquals(user, dao.save(user));
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#save(com.michael.adkins.devices.management.entity.Device)}.
	 */
	@Test
	void testSaveTwoDevices_returnsSameDeviceTwice() {
		User user1 = new User("Natalya", "Nemchinova", new Calendar.Builder().setDate(1991, 1, 14).build().getTime());
		assertEquals(user1, dao.save(user1));
		User user2 = new User("Natalia", "Poklonskaya", new Calendar.Builder().setDate(1980, 3, 18).build().getTime());
		assertEquals(user2, dao.save(user2));
	}
}
