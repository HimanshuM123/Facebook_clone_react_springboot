import React from "react";
import Image from "next/image";
import { IoMdPeople } from "react-icons/io";
import SidebarItem from "./SidebarItem";
import {
  MdGroups,
  MdOutlineOndemandVideo,
  MdOutlineExpandMore,
} from "react-icons/md";
import { AiOutlineShop } from "react-icons/ai";
import { BsStopwatch } from "react-icons/bs";

const Sidebar = () => {
  return (
    <div
      className="hidden lg:inline-flex flex-col py-2 pl-2
    max-w-xl lg: min-w-[320px]"
    >
      <div className="flex items-center space-x-2 py-3 pl-4 hover:bg-gray-200 rounded-l-xl cursor-pointer">
        <Image
          src="/profile_fb.png"
          height={40}
          width={40}
          className="rounded-full cursor-pointer"
        />
        <p className="hidden sm:inline-flex font-medium">Himanshu Mahale</p>
      </div>
      <SidebarItem Icon={IoMdPeople} value="Friends" />
      <SidebarItem Icon={MdGroups} value="Groups" />
      <SidebarItem Icon={AiOutlineShop} value="Marketplace" />
      <SidebarItem Icon={MdOutlineOndemandVideo} value="Watch" />
      <SidebarItem Icon={BsStopwatch} value="Memories" />
      <SidebarItem Icon={MdOutlineExpandMore} value="Pages" />
    </div>
  );
};

export default Sidebar;
