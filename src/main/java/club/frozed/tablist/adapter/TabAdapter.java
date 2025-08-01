package club.frozed.tablist.adapter;

import club.frozed.tablist.entry.TabEntry;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * @author Ryzeon, Elb1to
 */
public interface TabAdapter {

	/**
	 * Get the tab header for a player.
	 *
	 * @param player the player
	 * @return string
	 */
	String getHeader(Player player);

	/**
	 * Get the tab player for a player.
	 *
	 * @param player the player
	 * @return string
	 */
	String getFooter(Player player);

	/**
	 * Get the tab lines for a player.
	 *
	 * @param player the player
	 * @return map
	 */
	List<TabEntry> getLines(Player player);
}
