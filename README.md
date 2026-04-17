# PT Ready — USAF Fitness Prep

An unofficial PFRA fitness preparation tool for U.S. Air Force members. Calculate your score, generate AI-driven training plans, and track your progress using the **March 2026 PFRA standards** and **Warfighter's Fitness Playbook 2.0**.

> **Disclaimer:** This is an unofficial tool, not affiliated with or endorsed by the U.S. Air Force, DAF, or DoD. For official guidance consult your UFPM or DAFMAN 36-2905.

---

## Features

- **Score Calculator** — Push-ups, sit-ups/CLRC/plank, 2-mile run or HAMR, and WHtR. Scored by age group and gender per March 2026 PFRA standards.
- **AI Training Plan** — Personalized periodized training plans generated via Groq (Llama 3.3 70B), following the Warfighter's Fitness Playbook 2.0 structure.
- **Workout Log** — Check off exercises, track daily completion, and log sessions.
- **Score History** — Save and review past PT scores over time.
- **Built-in Timers** — Fullscreen countdown timers for rest periods and timed holds. Official HAMR audio for mock cardio tests.

---

## Install (Android)

Download the latest APK from the [Releases](../../releases) page.

1. Download `USAF.PT.Ready.apk` to your Android device
2. Tap the file to install
3. If prompted, allow installation from unknown sources
4. PT Ready will appear on your home screen

---

## Tech Stack

- **Frontend:** Vanilla JS, HTML, CSS — no framework dependencies
- **Native wrapper:** [Capacitor](https://capacitorjs.com/) v8 (Android)
- **AI:** [Groq API](https://console.groq.com) via Cloudflare Workers proxy (Llama 3.3 70B)
- **Hosted PWA:** [ptreadiness.app](https://ptreadiness.app)

---

## Building from Source

### Prerequisites

- Node.js 18+
- Android Studio (for Android builds)
- Java 17+

### Setup

```bash
npm install
npx cap sync
npx cap open android
```

Then in Android Studio: **Run > Run 'app'**

### Project Structure

```
/www          # Web source (HTML, JS, CSS, assets)
/android      # Capacitor Android project
/assets       # Icons and static assets
capacitor.config.json
package.json
```

After editing any files in `/www`, run `npx cap sync` to push changes into the Android project.

---

## Official References

- [PFRA Scoring Charts (Official PDF)](https://www.afpc.af.mil/Portals/70/documents/FITNESS/PFRA%20Scoring%20Charts.pdf)
- [Warfighter's Fitness Playbook 2.0 (Feb 2026)](https://www.afpc.af.mil/Portals/70/documents/FITNESS/Tab%204.%20The%20Warfighter's%20Fitness%20Playbook%20%202.0%20Feb%202026.pdf)

---

## Support

This app is free. AI APIs are not. If it's been useful, [please consider supporting](https://buymeacoffee.com/someanon).

---

## Version History

| Version | Date | Notes |
|---------|------|-------|
| 2.0 | Apr 2026 | Fixed WHtR scoring, UI improvements, native Android app |
| 1.3.1 | Mar 2026 | Minor UX tweaks |
| 1.3 | Feb 2026 | Renamed to PT Ready, in-app feedback, haptic feedback |
| 1.2 | Feb 2026 | Warfighter's Fitness Playbook 2.0, March 2026 PFRA standards |
| 1.1 | Jan 2026 | AI plan generation, score history, WHtR component |
| 1.0 | Jan 2026 | Initial release |
